package com.mzhslab.koreavpn.utils.roundedprogress;

import android.content.Context;
import android.util.TypedValue;

public class CalculationUtil {

	public static int convertDpToPx(float dp, Context context) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
				context.getResources().getDisplayMetrics());
	}
}
