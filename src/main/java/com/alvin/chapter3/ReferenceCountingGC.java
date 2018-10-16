package com.alvin.chapter3;

/**
 * Created by alvinlkk on 2017/8/1.
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];


}
