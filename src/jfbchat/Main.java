 /* ###########################################################################
  *
  *  JFBChat it's a simple software written in Java that let you int contact
  *  with yours Facebook friends without your browser.
  *  Copyright (C) 2011  Digitex (Giuseppe Federico)
  *
  *  This program is free software: you can redistribute it and/or modify
  *  it under the terms of the GNU General Public License as published by
  *  the Free Software Foundation, either version 3 of the License, or
  *  (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  *
  *###########################################################################
  *
  */

package jfbchat;


import jfbchat.resources.*;



public class Main {
 

    public static void main( String[] args ) {

       if(Sys.NAME_OS.equals("Linux")){

               Options.HOME_DIR = System.getProperty("user.home");
               Options.CONFIGFILE = Options.HOME_DIR + "/.jfbchat/" + Options.CONFIGFILE;
               
       }
          
    
        System.out.println("Starting IM client");
        Application run = new Application();
        
     
            
            
        }
   
    }
   




