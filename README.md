# carousel-layout-using-viewPager2

if you want make current page zoom like this image 
![Screenshot_1569240546](https://user-images.githubusercontent.com/30828060/65424532-67eb2580-de29-11e9-9452-35cd545d5049.png)

then please use this PageTransformer

        float pageMargin = getResources().getDimensionPixelOffset(R.dimen.pageMargin);
        float pageOffset = getResources().getDimensionPixelOffset(R.dimen.offset);

        myViewPager2.setPageTransformer((page, position) -> {
            float myOffset = position * -(2 * pageOffset + pageMargin);
            if (position < -1) {
                page.setTranslationX(-myOffset);
            } else if (position <= 1) {
                float scaleFactor = Math.max(0.7f, 1 - Math.abs(position - 0.14285715f));
                page.setTranslationX(myOffset);
                page.setScaleY(scaleFactor);
                page.setAlpha(scaleFactor);
            } else {
                page.setAlpha(0);
                page.setTranslationX(myOffset);
            }
        });

Here is the output of this repositorie 
![untitled](https://user-images.githubusercontent.com/30828060/65403743-f5f7e980-ddf2-11e9-9c33-28b89feb4a82.gif)
