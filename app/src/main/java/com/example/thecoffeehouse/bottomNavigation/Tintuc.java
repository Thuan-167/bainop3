package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.Notify;
import com.example.thecoffeehouse.R;

public class Tintuc extends Fragment implements View.OnClickListener {

    ImageView img1_244, img2_244;
    RelativeLayout rl1_244, rl2_244, rl3_244;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_tintuc, container, false);


        img1_244 = root.findViewById(R.id.imageNotify);
        img1_244.setOnClickListener(this);
        img2_244 = root.findViewById(R.id.imageAdd);
        img2_244.setOnClickListener(this);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                open();
//            }
//        });

        rl1_244 = root.findViewById(R.id.relativeTichdiem);
        rl2_244 = root.findViewById(R.id.relativeDathang);
        rl3_244 = root.findViewById(R.id.relativeCoupon);
        rl1_244.setOnClickListener(this);
        rl2_244.setOnClickListener(this);
        rl3_244.setOnClickListener(this);

//        rl1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });
//
//        rl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               inflater.inflate(R.layout.fragment_navigation_dathang,container,false);
//
//            }
//        });
//
//        rl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });

        return root;
    }

//    public void open() {
//        Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//        startActivity(dsp);
//    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd) {
            Intent dsp = new Intent(Tintuc.this.getActivity(), Information.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }


}