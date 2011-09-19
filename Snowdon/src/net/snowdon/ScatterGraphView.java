/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.snowdon;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/**
 * Inherits from GraphView and draws a graph with a simple marker at data
 * points.
 */
public class ScatterGraphView extends GraphView {
	/**
	 * Creates a new ScatterGraphView and sets layout parameters from XML via
	 * GraphView.
	 * 
	 * @param context
	 * @param attributes
	 */
	public ScatterGraphView(Context context, AttributeSet attributes) {
			super(context, attributes);
	}
	
	@Override
	protected void drawAscendingSection(Canvas canvas, float[] coords) {
		canvas.drawLine(coords[0] - mAscendingPaint.getStrokeWidth() * 3, coords[1], coords[0] + mAscendingPaint.getStrokeWidth() * 3, coords[1], mAscendingPaint);
		canvas.drawLine(coords[0], coords[1] - mAscendingPaint.getStrokeWidth() * 3, coords[0], coords[1] + mAscendingPaint.getStrokeWidth() * 3, mAscendingPaint);
	}
	
	@Override
	protected void drawDescendingSection(Canvas canvas, float[] coords) {
		canvas.drawLine(coords[0] - mAscendingPaint.getStrokeWidth() * 3, coords[1], coords[0] + mAscendingPaint.getStrokeWidth() * 3, coords[1], mDescendingPaint);
		canvas.drawLine(coords[0], coords[1] - mAscendingPaint.getStrokeWidth() * 3, coords[0], coords[1] + mAscendingPaint.getStrokeWidth() * 3, mDescendingPaint);
	}
}