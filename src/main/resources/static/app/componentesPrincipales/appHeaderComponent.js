export class AppHeaderComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const cuerpoWebsite = document.getElementById("cuerpoWebDashboard");


        // Creando los elementos HTML necesarios
        let headerEncabezado = document.createElement("header");
        let divContainer = document.createElement("div");
        let h1ContainerTitulo = document.createElement("h1");
        let divContainerPerfil = document.createElement("div");
        let spanNombrePerfil = document.createElement("span");
        let imgFotoPerfil = document.createElement("img");


        // Creando los nodos de texto correspondientes
        let textTituloEncabezado = document.createTextNode("Encuestas Dashboard");
        let textNombrePerfil = document.createTextNode("Username here");  // AGREGAR NOMBRE DE USUARIO DINÁMICAMENTE
        

        // Agregándole los atributos a cada etiqueta
        headerEncabezado.setAttribute("id", "encabezado");
        headerEncabezado.setAttribute("class", "encabezado");
        divContainer.setAttribute("class", "container");
        h1ContainerTitulo.setAttribute("class", "container__titulo");
        divContainerPerfil.setAttribute("class", "perfil");
        spanNombrePerfil.setAttribute("class", "perfil__username");
        imgFotoPerfil.setAttribute("src", "/assets/img/jpg/fotoPerfil.jpg");  // AGREGAR URL DINÁMICAMENTE
        imgFotoPerfil.setAttribute("alt", "foto_perfil_usuario");
        imgFotoPerfil.setAttribute("title", "Foto de perfil");
        imgFotoPerfil.setAttribute("class", "perfil__imgUser");


        // Agregar los nodos de texto correspondientes
        h1ContainerTitulo.appendChild(textTituloEncabezado);
        spanNombrePerfil.appendChild(textNombrePerfil);


        // Creando el DOM para insertarlo al HTML
        cuerpoWebsite.appendChild(headerEncabezado);
        headerEncabezado.appendChild(divContainer);
        divContainer.appendChild(h1ContainerTitulo);
        headerEncabezado.appendChild(divContainerPerfil);
        divContainerPerfil.appendChild(spanNombrePerfil);
        divContainerPerfil.appendChild(imgFotoPerfil);


        // Creando los eventos pertinentes
    }
}

customElements.define("appheader-component", AppHeaderComponent);