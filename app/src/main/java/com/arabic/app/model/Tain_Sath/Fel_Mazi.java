package com.arabic.app.model.Tain_Sath;

/**
 * Created by Maziar on 12/15/2017.
 */

public class Fel_Mazi {


    public Fel_Mazi() {
    }


    private int id;
    private String title;
    private String rb_1_mazi;
    private String rb_2_mazi;
    private String rb_3_mazi;
    private String rb_4_mazi;
    private String rb_5_mazi;
    private int correct;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRb_1_mazi() {
        return rb_1_mazi;
    }

    public void setRb_1_mazi(String rb_1_mazi) {
        this.rb_1_mazi = rb_1_mazi;
    }

    public String getRb_2_mazi() {
        return rb_2_mazi;
    }

    public void setRb_2_mazi(String rb_2_mazi) {
        this.rb_2_mazi = rb_2_mazi;
    }

    public String getRb_3_mazi() {
        return rb_3_mazi;
    }

    public void setRb_3_mazi(String rb_3_mazi) {
        this.rb_3_mazi = rb_3_mazi;
    }

    public String getRb_4_mazi() {
        return rb_4_mazi;
    }

    public void setRb_4_mazi(String rb_4_mazi) {
        this.rb_4_mazi = rb_4_mazi;
    }

    public String getRb_5_mazi() {
        return rb_5_mazi;
    }

    public void setRb_5_mazi(String rb_5_mazi) {
        this.rb_5_mazi = rb_5_mazi;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public Fel_Mazi(int id, String title, String rb_1_mazi, String rb_2_mazi, String rb_3_mazi, String rb_4_mazi, String rb_5_mazi, int correct) {
        this.id = id;
        this.title = title;
        this.rb_1_mazi = rb_1_mazi;
        this.rb_2_mazi = rb_2_mazi;
        this.rb_3_mazi = rb_3_mazi;
        this.rb_4_mazi = rb_4_mazi;
        this.rb_5_mazi = rb_5_mazi;
        this.correct = correct;


    }
}
