package com.mobile.member.enums;

public enum Platform {

	OPERATOR("operator", 'z'),
	PURCHASER("purchaser", 'y'),
	PROVIDER("provider", 'x'),
	B2G("b2g", 'w'),
	DISTRIBUTOR("distributor", 'v');

	private String value;
	private char flag;

	private Platform(String val, char flag) {
		this.value = val;
		this.flag = flag;
	}

	public String value() {
		return this.value;
	}

	public char flag() {
		return this.flag;
	}

	public static Platform getByValue(String value) {
	    for (Platform p : Platform.values()) {
	        if (p.value().equals(value)) {
	            return p;
	        }
	    }
	    return null;
	}

	public static Platform getByFlag(char flag) {
        for (Platform p : Platform.values()) {
            if (p.flag() == flag) {
                return p;
            }
        }
        return null;
	}

}
