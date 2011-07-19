package com.allen_sauer.gwt.dnd.client.drop;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.bradrydzewski.gwt.calendar.client.CalendarWidget;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class DayViewPickupDragController extends PickupDragController {

	public DayViewPickupDragController(AbsolutePanel boundaryPanel,
			boolean allowDroppingOnBoundaryPanel) {
		super(boundaryPanel, allowDroppingOnBoundaryPanel);
	}
	
	@Override
	public void dragMove() {
		try {
			super.dragMove();
		} catch(NullPointerException ex) { }
	}
}
