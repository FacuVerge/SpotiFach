const urlParams = new URLSearchParams(window.location.search);

const apiCanciones ="http://localhost:7008/api/canciones/"+ urlParams.get('genero');

new Vue({
    el: '#app',
    data: {
    	canciones: [{
    		id: null,
    		nombre: null,
    		urlPista: null,
    		artistas: [],
    		generos: []
    	}]
    },
    created(){
        fetch(apiCanciones)
            .then(response =>{return response.json()})
            .then(cancionesObtenidas =>{
                this.canciones = cancionesObtenidas;
            }).then(startCarrusel);;
    },
    methods:{
    }
});