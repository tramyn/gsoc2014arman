/*
 * $Id: OctaveModel.java 89 2011-06-14 15:25:10Z niko-rodrigue $
 * $URL: svn://svn.code.sf.net/p/sbfc/code/trunk/src/org/sbfc/converter/models/OctaveModel.java $
 *
 *
 * ==============================================================================
 * Copyright (c) 2010 the copyright is held jointly by the individual
 * authors. See the file AUTHORS for the list of authors
 *
 * This file is part of The System Biology Format Converter (SBFC).
 *
 * SBFC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SBFC is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SBFC.  If not, see<http://www.gnu.org/licenses/>.
 * 
 * ==============================================================================
 * 
 */

package org.sbfc.converter.models;


public class OctaveModel extends StringModel {
	
	public String getFileType() {
		return ".m";
	}
}
