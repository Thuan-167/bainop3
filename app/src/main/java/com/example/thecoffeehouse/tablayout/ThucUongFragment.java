package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class ThucUongFragment extends Fragment {

    private GridView gvmon;
    private SanPhamAdapter spadt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon = r.findViewById(R.id.gv_mon);
        spadt = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gvmon.setAdapter(spadt);
        registerForContextMenu(gvmon);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt.add(new DoUong(R.drawable.capheden, "Cà phê đen đá", "32.000"));
        spadt.add(new DoUong(R.drawable.caphesua, "Cà phê sữa đá", "32.000"));
        spadt.add(new DoUong(R.drawable.bacxiu1, "Bạc xỉu", "32.000"));
        spadt.add(new DoUong(R.drawable.coldbrewcamsa, "Cold brew cam sả", "50.000"));
        spadt.add(new DoUong(R.drawable.cappuccino, "Cappuccino", "45.000"));
        spadt.add(new DoUong(R.drawable.tradaocamsa, "Trà đào cam sả", "45.000"));
        spadt.add(new DoUong(R.drawable.tradenmacchiato, "Trà đen macchiato", "42.000"));
        spadt.add(new DoUong(R.drawable.trasuamacca, "Trà sữa macca", "42.000"));

    }

    private void addEvents() {
        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang);
                dialog.show();
            }
        });
        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang);
                dialog.show();

                return true;
            }
        });
    }
}