package com.meyou;

public interface ReadBytesListener {
    void onReading(byte[] bytes, boolean readOver);
}
