const apiGeneros = "http://localhost:7008/api/generos";

new Vue({
	el: '#app',
    data: {
      	generos: [{
      		id: null,
      		nombre: null,
      		imagen_base64: null
      	}]
    },
    methods: {
    	elegirGenero: function(genero) {

    		window.location.href = 'reproductor.html/genero=' + genero;

    	}
    },
    created() {
		fetch(apiGeneros)
			.then(response => response.json())
            .then(generosObtenidos => {
            	this.generos = generosObtenidos
            })


    }
})