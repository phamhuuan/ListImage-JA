package com.example.viewimage;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	ListView listImage;
	GridView gridImage;
	RadioButton radioButtonList, radioButtonViewPager, radioButtonGrid;
	ArrayList<GalleryImage> arrayListImage, arrayGridImage, arrayPageViewImage, emptyList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listImage = findViewById(R.id.listImage);
		gridImage = findViewById(R.id.gridImage);
		radioButtonGrid = findViewById(R.id.radioButtonGrid);
		radioButtonList = findViewById(R.id.radioButtonList);
		radioButtonViewPager = findViewById(R.id.radioButtonViewPager);

		arrayListImage = new ArrayList<>();
		arrayGridImage = new ArrayList<>();
		emptyList = new ArrayList<>();
		addData(arrayListImage);
		ListImageAdapter listImageAdapter, gridImageAdapter;
		listImageAdapter= new ListImageAdapter(this, R.layout.image_list_view, arrayListImage);
		gridImageAdapter = new ListImageAdapter(this, R.layout.image_list_view, arrayListImage, ImageView.ScaleType.CENTER_CROP);
		listImage.setAdapter(listImageAdapter);
		gridImage.setAdapter(gridImageAdapter);

		radioButtonList.setOnCheckedChangeListener((buttonView, isChecked) -> {
			if (!isChecked) {
				listImage.setVisibility(View.INVISIBLE);
			} else  {
				listImage.setVisibility(View.VISIBLE);
			}
			listImageAdapter.notifyDataSetChanged();
		});
		radioButtonGrid.setOnCheckedChangeListener(((buttonView, isChecked) -> {
			if (!isChecked) {
				gridImage.setVisibility(View.INVISIBLE);
			} else {
				gridImage.setVisibility(View.VISIBLE);
			}
			gridImageAdapter.notifyDataSetChanged();
		}));
	}

	private void addData (ArrayList<GalleryImage> arrayList) {
		arrayList.add(new GalleryImage(R.drawable.autumn01));
		arrayList.add(new GalleryImage(R.drawable.autumn02));
		arrayList.add(new GalleryImage(R.drawable.autumn03));
		arrayList.add(new GalleryImage(R.drawable.autumn04));
		arrayList.add(new GalleryImage(R.drawable.autumn05));
		arrayList.add(new GalleryImage(R.drawable.autumn06));
		arrayList.add(new GalleryImage(R.drawable.autumn07));
		arrayList.add(new GalleryImage(R.drawable.autumn08));
		arrayList.add(new GalleryImage(R.drawable.autumn09));
		arrayList.add(new GalleryImage(R.drawable.autumn10));
		arrayList.add(new GalleryImage(R.drawable.autumn11));
		arrayList.add(new GalleryImage(R.drawable.autumn12));
		arrayList.add(new GalleryImage(R.drawable.autumn13));
		arrayList.add(new GalleryImage(R.drawable.autumn14));
		arrayList.add(new GalleryImage(R.drawable.autumn15));
		arrayList.add(new GalleryImage(R.drawable.autumn16));
		arrayList.add(new GalleryImage(R.drawable.autumn17));
		arrayList.add(new GalleryImage(R.drawable.autumn18));
		arrayList.add(new GalleryImage(R.drawable.autumn19));
		arrayList.add(new GalleryImage(R.drawable.autumn20));
		arrayList.add(new GalleryImage(R.drawable.autumn21));
		arrayList.add(new GalleryImage(R.drawable.autumn22));
		arrayList.add(new GalleryImage(R.drawable.autumn23));
		arrayList.add(new GalleryImage(R.drawable.autumn24));
	}
}