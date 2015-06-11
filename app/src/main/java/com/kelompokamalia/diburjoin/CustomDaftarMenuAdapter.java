package com.kelompokamalia.diburjoin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by acer-pc on 6/11/2015.
 */
public class CustomDaftarMenuAdapter extends ArrayAdapter<DaftarMenu> {

        public  CustomDaftarMenuAdapter(Context context, ArrayList<DaftarMenu> DaftarMenus){
            super(context, 0, DaftarMenus);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            DaftarMenu daftarmenu = getItem(position);

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitemmenu, parent, false);
            }

            TextView makanan = (TextView) convertView.findViewById(R.id.DaftarMenuMakanan);


            makanan.setText(daftarmenu.namaMakanan);


            return convertView;
        }
    }
}
