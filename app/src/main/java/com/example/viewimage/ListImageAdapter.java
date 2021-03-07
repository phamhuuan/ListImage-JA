package com.example.viewimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ListImageAdapter extends BaseAdapter {
	private final Context context;
	private final int layout;
	private final List<GalleryImage> galleryImageListView;
	private ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;

	public ListImageAdapter(Context context, int layout, List<GalleryImage> galleryImageListView) {
		this.context = context;
		this.layout = layout;
		this.galleryImageListView = galleryImageListView;
	}

	public ListImageAdapter(Context context, int layout, List<GalleryImage> galleryImageListView, ImageView.ScaleType scaleType) {
		this.context = context;
		this.layout = layout;
		this.galleryImageListView = galleryImageListView;
		this.scaleType = scaleType;
	}

	@Override
	public int getCount() {
		return galleryImageListView.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(layout, null);
			viewHolder.imageView = convertView.findViewById(R.id.imageView);
			viewHolder.imageView.setScaleType(scaleType);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		GalleryImage galleryImage = galleryImageListView.get(position);
		Glide.with(convertView).load(galleryImage.getImage()).into(viewHolder.imageView);
		return convertView;
	}

	static class ViewHolder {
		ImageView imageView;
	}
}
