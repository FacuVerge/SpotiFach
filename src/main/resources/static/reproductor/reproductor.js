const urlParams = new URLSearchParams(window.location.search);

const apiCanciones ="http://localhost:7008/api/canciones/"+ urlParams.get('genero');

var app1 = new Vue({
    el: '#app',
    data: {
    	canciones: [{
    		id: null,
    		nombre: null,
    		urlPista: null,
    		artistas: [],
    		album: null,
    		generos: [],
    		artistasMapeados: null
    	}],
    	indice: null
    },
    created(){
        fetch(apiCanciones)
            .then(response =>{return response.json()})
            .then(cancionesObtenidas =>{
                this.canciones = cancionesObtenidas;
            });
            this.indice = 0
    },
    methods:{
    	anteriorCancion() {
        	if(this.indice == 0) {
        		this.indice = this.canciones.length - 1
        	}else{
        		this.indice = this.indice - 1
        	}
        },
        siguienteCancion() {
        	if(this.indice >= this.canciones.length - 1) {
        		this.indice = 0
            }else{
       			this.indice = this.indice + 1
       		}
        },
        pausarMusica() {
        },
        reproducirMusica() {
        }
    }
})