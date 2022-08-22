package com.yuan.mytest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wl
 * @create 2022/08/19
 */
public class MyTest {
    public static void main(String[] args) {
        List<CurCountVo> list = new ArrayList<>();
        list.add(new CurCountVo(SleepTimeEnum.SIX_2_EIGHT.getValue(), 20));
        list.add(new CurCountVo(SleepTimeEnum.LESS_SIX.getValue(), 20));
        list.add(new CurCountVo(SleepTimeEnum.TEN_MORE.getValue(), 20));
        list.add(new CurCountVo(SleepTimeEnum.NINE_2_TEN.getValue(), 20));
        list.add(new CurCountVo(SleepTimeEnum.EIGHT_2_NINE.getValue(), 20));

        list.forEach(curCountVo -> System.out.println(SleepTimeEnum.getOrderByValue(curCountVo.getName())));
       list =  list.stream().sorted(((o1, o2) -> SleepTimeEnum.getOrderByValue(o2.getName())-SleepTimeEnum.getOrderByValue(o1.getName()))).collect(Collectors.toList());
        System.out.println(list);
    }
}
