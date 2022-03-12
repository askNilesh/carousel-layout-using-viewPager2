package com.nilu.myapplication

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView

class PagerMarginItemDecoration(context: Context, @DimenRes horizontalMargin: Int) :
  RecyclerView.ItemDecoration() {

  private val horizontalMarginInPx: Int =
    context.resources.getDimension(horizontalMargin).toInt()

  override fun getItemOffsets(
    outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
  ) {
    outRect.right = horizontalMarginInPx
    outRect.left = horizontalMarginInPx
  }
}