package org.lwr.edgar.view

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import org.lwr.edgar.common.TypefaceUtil


class ButtonRegular : Button {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    override fun onFinishInflate() {
        super.onFinishInflate()
        typeface = TypefaceUtil.getRegular(context)
    }
}