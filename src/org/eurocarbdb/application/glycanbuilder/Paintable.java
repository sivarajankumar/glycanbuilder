package org.eurocarbdb.application.glycanbuilder;

import java.awt.Graphics2D;

public interface Paintable {
	public Graphics2D getGraphics2D();
	public Object getObject();
	public void clear();
}
