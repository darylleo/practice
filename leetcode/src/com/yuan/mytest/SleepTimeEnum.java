package com.yuan.mytest;

/**
 * @author wl
 * @create 2022/08/19
 */
public enum SleepTimeEnum {
    LESS_SIX("LESS_SIX", "6小时以下", 1),
    SIX_2_EIGHT("SIX_2_EIGHT", "6~8小时", 2),
    EIGHT_2_NINE("EIGHT_2_NINE", "8~9小时", 3),
    NINE_2_TEN("NINE_2_TEN", "9~10小时", 4),
    TEN_MORE("TEN_MORE", "10小时以上", 5),
    ;

    private final String code;
    private final String value;

    private final int sortOrder;


    SleepTimeEnum(String code, String value, Integer sortOrder) {
        this.code = code;
        this.value = value;
        this.sortOrder = sortOrder;
    }

    public static int getOrderByValue(String name) {
        for (SleepTimeEnum value : values()) {
            if (value.getValue().equals(name)) {
                return value.sortOrder;
            }
        }
        return 0;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public int getSortOrder() {
        return sortOrder;
    }
}
