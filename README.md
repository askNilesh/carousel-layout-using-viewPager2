# carousel-layout-using-viewPager2

Here is the output of this repository

<img src="https://user-images.githubusercontent.com/30828060/65403743-f5f7e980-ddf2-11e9-9c33-28b89feb4a82.gif"  width="200" height="400" />

if you want make current page zoom like this image 

<img src="https://user-images.githubusercontent.com/30828060/158024722-4679f8a6-6178-4c77-8b63-cf79e032e9bf.png"  width="200" height="400" />

Then please use this PageTransformer

     private fun createCardHolder() {

        viewPager?.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager?.adapter = myAdapter
        viewPager?.offscreenPageLimit = 1

        val nextItemVisibleWidth = resources.getDimension(R.dimen.next_item_visible_width)
        val currentItemMargin =
            resources.getDimension(R.dimen.viewpager_horizontal_margin)
        val pageTranslation = nextItemVisibleWidth + currentItemMargin
        viewPager?.setPageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslation * position
            page.scaleY = 1 - (0.25f * abs(position))
            page.alpha = 0.25f + (1 - abs(position))
        }
        val itemDecoration = PagerMarginItemDecoration(
            this,
            R.dimen.viewpager_horizontal_margin
        )
        viewPager?.addItemDecoration(itemDecoration)
    }


# Other Transformation with ViewPager2  https://github.com/askNilesh/Viewpager-Transformation

