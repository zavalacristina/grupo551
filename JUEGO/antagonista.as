﻿package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.utils.Timer;
	import flash.events.TimerEvent;
	
	public class antagonista extends MovieClip {
   private var vel: Number=5;
   private var limite_der: int=520;
   private var limite_izq: int=30;
   private var dir: Number=1;
   private var cambia: Timer =new Timer(200,0);
   private var tipo: Number;
   
   private var lanzar: Timer=new Timer(2000,0);
   
   
		public function antagonista() {
			// constructor code
			
			addEventListener(Event.ENTER_FRAME, masvel);
			
			addEventListener(Event.ENTER_FRAME, actualiza);
			cambia.addEventListener(TimerEvent.TIMER, cambia_dir);
			cambia.start();
			lanzar.addEventListener(TimerEvent.TIMER,lanza_vala);
			lanzar.start();
			
		}
		public function lanza_vala(TimerEvent){
			//trace("lanza vala");
			var vala_nueva= new vala(x,y);
			stage.addChild(vala_nueva);
		}
		public function cambia_dir(e:TimerEvent){
			tipo=Math.floor(Math.random()*8);
			trace(tipo);
			switch(tipo){
				case 1:
				dir=1;
				break;
				case 2:
				dir=-1;
				break;
			}
		}
		public function actualiza(e:Event){
			x+=vel*dir;
			if(x>=limite_der){
				dir=-1;
			}
			if(x<=limite_izq){
				dir=1;
			}
		}
		public function masvel (e:Event){
		if(setup.puntos==5){
		vel=10;
		}else if(setup.puntos==10){
			vel=15;
		}else if(setup.puntos==15){
			vel=20;
		}
				}
      
	}
	
}

