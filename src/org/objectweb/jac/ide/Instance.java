/*
  Copyright (C) 2002 Renaud Pawlak <renaud@aopsys.com>

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as
  published by the Free Software Foundation; either version 2 of the
  License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public
  License along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
  USA */

package org.objectweb.jac.ide;

public class Instance extends TypedElement {

   Package container;
   
   /**
    * Get the value of container.
    * @return value of container.
    */
   public Package getContainer() {
      return container;
   }
   
   /**
    * Set the value of container.
    * @param v  Value to assign to container.
    */
   public void setContainer(Package  v) {
      this.container = v;
   }

}


