package com.sslavik.socialspinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sslavik.socialspinner.R;
import com.sslavik.socialspinner.model.Social;

import java.util.List;


public class SocialAdapter extends ArrayAdapter<Social> {
    public SocialAdapter(@NonNull Context context, @NonNull List<Social> listSocial) {
        super(context, R.layout.item_social , listSocial);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social, parent, false);
            viewHolder.imSocial = convertView.findViewById(R.id.ivSocial);
            viewHolder.tvSocial = convertView.findViewById(R.id.tvSocial);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imSocial.setImageResource(getItem(position).getIcon());
        viewHolder.tvSocial.setText(getItem(position).getName());

        return convertView;
    }

    public class ViewHolder {
        private ImageView imSocial;
        private TextView tvSocial;
    }
}
