package com.arabic.app.Paye_Haft.Hashtom.Tamrin_Class_Hashtom.moratab_sazi_2;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.arabic.app.Network.AppController;
import com.arabic.app.Network.SavePref;
import com.arabic.app.R;
import com.arabic.app.model.model_8_class.Model_Moratab_Sazi_8_class_2;

import java.util.List;

/**
 * Created by Maziar on 12/15/2017.
 */

public class RecyclerAdaper_Tamrin_8_class_1 extends RecyclerView.Adapter<RecyclerAdaper_Tamrin_8_class_1.MyViewHolder> {

    private int lastPosition = -1;
    private boolean iscolor = true;
    private List<Model_Moratab_Sazi_8_class_2> itemList;
    private Context mContext;
    private Typeface font;
    private SavePref save;
    private int total_score = 0;

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public TextView tv_tamrin_8_class_2_title;
        public RadioButton rb_tamrin_8_class_2_1, rb_tamrin_8_class_2_2, rb_tamrin_8_class_2_3, rb_tamrin_8_class_2_4, rb_tamrin_8_class_2_5,rb_tamrin_8_class_2_6;


        public MyViewHolder(View view) {
            super(view);

            tv_tamrin_8_class_2_title = (TextView) itemView.findViewById(R.id.tv_tamrin_8_class_2_title);

            rb_tamrin_8_class_2_1 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_1);
            rb_tamrin_8_class_2_2 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_2);
            rb_tamrin_8_class_2_3 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_3);
            rb_tamrin_8_class_2_4 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_4);
            rb_tamrin_8_class_2_5 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_5);
            rb_tamrin_8_class_2_6 = (RadioButton) itemView.findViewById(R.id.rb_tamrin_8_class_2_6);

        }
    }


    public RecyclerAdaper_Tamrin_8_class_1(Context context, List<Model_Moratab_Sazi_8_class_2> itemList) {
        this.itemList = itemList;
        this.mContext = context;
        save = new SavePref(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_tamrin_8_class_2, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Model_Moratab_Sazi_8_class_2 Item = itemList.get(position);

        holder.tv_tamrin_8_class_2_title.setText(Item.getTitle());
        holder. rb_tamrin_8_class_2_1.setText(Item.getRb_1_mazi());
        holder. rb_tamrin_8_class_2_2.setText(Item.getRb_2_mazi());
        holder. rb_tamrin_8_class_2_3.setText(Item.getRb_3_mazi());
        holder. rb_tamrin_8_class_2_4.setText(Item.getRb_4_mazi());
        holder. rb_tamrin_8_class_2_5.setText(Item.getRb_5_mazi());
        holder. rb_tamrin_8_class_2_6.setText(Item.getRb_6_mazi());


        holder. rb_tamrin_8_class_2_1.setTag("1");
        holder. rb_tamrin_8_class_2_2.setTag("2");
        holder. rb_tamrin_8_class_2_3.setTag("3");
        holder. rb_tamrin_8_class_2_4.setTag("4");
        holder. rb_tamrin_8_class_2_5.setTag("5");
        holder. rb_tamrin_8_class_2_6.setTag("6");


        holder.rb_tamrin_8_class_2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_1, Item.getCorrect());
                }
            }
        });

        holder.rb_tamrin_8_class_2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_2, Item.getCorrect());
                }
            }
        });

        holder.rb_tamrin_8_class_2_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_3, Item.getCorrect());
                }
            }
        });

        holder.rb_tamrin_8_class_2_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_4, Item.getCorrect());
                }
            }
        });

        holder.rb_tamrin_8_class_2_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_5, Item.getCorrect());
                }
            }
        });

        holder.rb_tamrin_8_class_2_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    calc(holder.rb_tamrin_8_class_2_6, Item.getCorrect());
                }
            }
        });

        //setAnimation(holder.card_item);
        //setScaleAnimation(holder.click_discount_cardview);
        //setFadeAnimation(holder.card_item);
    }



    private void calc(RadioButton rb , int correct) {

        //save.save(AppController.SAVE_RANK, total_score);

        if(rb.getTag().toString().equals(String.valueOf(correct))){
            total_score++;
            Log.e("TAG", ""+total_score);
        }else {
            if (total_score !=0) total_score--;
        }

        save.save(AppController.SAVE_RANK, total_score);

        //Log.e("TAG", "total_score:::::"+ total_score);

    }



    @Override
    public int getItemCount() {
        return itemList.size();
    }

    /*private void setAnimation(View viewToAnimate) {

        Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.up_from_bottom);
        animation.setDuration(1000);
        viewToAnimate.startAnimation(animation);


    }*/


    @Override
    public void onViewDetachedFromWindow(MyViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        //holder.card_item.clearAnimation();
    }


}
