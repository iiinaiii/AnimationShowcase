package com.sample.kyoumi155.animationshowcase

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    var isExpand = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.image_expand)
    fun onClickExpand(imageView: ImageView) {
        if (isExpand) {
            imageView.setImageDrawable(getDrawable(R.drawable.avd_expand_less))
        } else {
            imageView.setImageDrawable(getDrawable(R.drawable.avd_expand_more))
        }
        val drawable = imageView.drawable
        if (drawable is AnimatedVectorDrawable) {
            drawable.start()
        }
        isExpand = !isExpand
    }
}
