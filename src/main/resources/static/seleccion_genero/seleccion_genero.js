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
    },
    created() {
		fetch(apiGeneros)
			.then(response => response.json())
            .then(generosObtenidos => {
            	this.generos = generosObtenidos
            })


    }
})