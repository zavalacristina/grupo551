package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	public class vala extends MovieClip {
        
		private var vel: Number=5;
		public function vala(pos_x, pos_y) {
			// constructor code
			x= pos_x;
			y= pos_y + 30;
			this.addEventListener(Event.ENTER_FRAME,mover);
		}
         public function mover(e:Event){
	      y += vel;
		  if(y>=350){
			  vel=0;
			  this.removeEventListener(Event.ENTER_FRAME,mover);
			  stage.removeChild(this);
		  }
		  if(this.hitTestObject(setup.protagonista_new)){
			  vel=0;
			  stage.removeChild(this);
			  this.removeEventListener(Event.ENTER_FRAME,mover);
			  setup.puntos+=1;
			  //trace (setup.puntos);
			  
		  }
}
	}
	
}
