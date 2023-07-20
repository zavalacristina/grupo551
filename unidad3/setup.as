package  {
	
	import flash.display.Sprite;
	import miperro;
	import mipersona;
	import miserpiente;
	import flash.display.SimpleButton;
	import flash.events.MouseEvent;
	import flash.events.Event;
	import flash.ui.Mouse;
	
	public class setup extends Sprite { //sprite porque ya posiciono los simbolos en la pantalla 
			public var Perro:miperro=new miperro();
			public var persona:mipersona=new mipersona();
			public var serpiente:miserpiente=new miserpiente();
			public var btncomiendo:SimpleButton;
			public var btnsentado:SimpleButton;
			public var btncaminando:SimpleButton;
			
			private var _animalSeleccionado:Animal = null;
			
			
		public function setup() {
			// constructor code
			
			btncomiendo.addEventListener(MouseEvent.CLICK, comer);
			btnsentado.addEventListener(MouseEvent.CLICK, sentado);
			btncaminando.addEventListener(MouseEvent.CLICK, caminando);
			
			Perro.addEventListener(MouseEvent.CLICK, seleccionPerro);
			persona.addEventListener(MouseEvent.CLICK, seleccionpersona);
			serpiente.addEventListener(MouseEvent.CLICK, seleccionserpiente);
			
			
			
		}
		private function seleccionPerro(e: MouseEvent): void {
			_animalSeleccionado = Perro;
		}
		private function seleccionpersona(e:MouseEvent) : void{
			 _animalSeleccionado=persona;
		}
		private function seleccionserpiente(e:MouseEvent): void{
			_animalSeleccionado= serpiente;
		}
	private function comer(e: MouseEvent){
		//Perro.comiendo();
		_animalSeleccionado.comiendo();
		//persona.comiendo();
		
		
		//serpiente.comiendo();
	}
	
	private function sentado(e: MouseEvent){
		//Perro.sentado();
		_animalSeleccionado.sentado();
		//persona.sentado();
		
		//serpiente.sentado();
	}
	private function caminando(e: MouseEvent){
		//Perro.caminando();
		_animalSeleccionado.caminando();
		//persona.caminando();
		
		//serpiente.caminando();
	}
	
	
	
	
	}
	
}
