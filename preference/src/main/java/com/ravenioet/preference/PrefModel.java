package com.ravenioet.preference;

public class PrefModel {
    private String pref_name;
    private String data_name;
    private int data_type;


    private String string_data;
    private int int_data;
    private float float_data;
    private long long_data;
    private boolean boolean_data;

    public PrefModel(String pref_name, String data_name, int data_type, String string_data) {
        this.pref_name = pref_name;
        this.data_name = data_name;
        this.data_type = data_type;
        this.string_data = string_data;
    }

    public PrefModel(String pref_name, String data_name, int data_type, int int_data) {
        this.pref_name = pref_name;
        this.data_name = data_name;
        this.data_type = data_type;
        this.int_data = int_data;
    }

    public PrefModel(String pref_name, String data_name, int data_type, float float_data) {
        this.pref_name = pref_name;
        this.data_name = data_name;
        this.data_type = data_type;
        this.float_data = float_data;
    }

    public PrefModel(String pref_name, String data_name, int data_type, long long_data) {
        this.pref_name = pref_name;
        this.data_name = data_name;
        this.data_type = data_type;
        this.long_data = long_data;
    }

    public PrefModel(String pref_name, String data_name, int data_type, boolean boolean_data) {
        this.pref_name = pref_name;
        this.data_name = data_name;
        this.data_type = data_type;
        this.boolean_data = boolean_data;
    }

    public String getPref_name() {
        return pref_name;
    }

    public void setPref_name(String pref_name) {
        this.pref_name = pref_name;
    }

    public boolean isBoolean_data() {
        return boolean_data;
    }

    public boolean getBoolean_data() {
        return boolean_data;
    }

    public void setBoolean_data(boolean boolean_data) {
        this.boolean_data = boolean_data;
    }

    public String getData_name() {
        return data_name;
    }

    public void setData_name(String data_name) {
        this.data_name = data_name;
    }

    public int getData_type() {
        return data_type;
    }

    public void setData_type(int data_type) {
        this.data_type = data_type;
    }

    public String getString_data() {
        return string_data;
    }

    public void setString_data(String string_data) {
        this.string_data = string_data;
    }

    public int getInt_data() {
        return int_data;
    }

    public void setInt_data(int int_data) {
        this.int_data = int_data;
    }

    public float getFloat_data() {
        return float_data;
    }

    public void setFloat_data(float float_data) {
        this.float_data = float_data;
    }

    public long getLong_data() {
        return long_data;
    }

    public void setLong_data(long long_data) {
        this.long_data = long_data;
    }
}
