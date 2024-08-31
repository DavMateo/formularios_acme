export class EncabezadoComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const cuerpoWebsite = document.getElementById("cuerpoWeb");

        // Creando los elementos HTML necesarios
        let encabezado = document.createElement("header");
        let contenedorLogo = document.createElement("div");
        let contenedorSocialMedia = document.createElement("div");
        let imagenLogo = document.createElement("img");
        let spanTextLogo = document.createElement("span");
        let linkInstagram = document.createElement("a");
        let imagenInstagram = document.createElement("img");
        let linkTwitter = document.createElement("a");
        let imagenTwitter = document.createElement("img");


        // Creando los nodos de texto correspondientes
        let textLogoTitulo = document.createTextNode("Campus Survey");


        // Agregándole los atributos a cada etiqueta
        encabezado.setAttribute("class", "encabezado");
        encabezado.setAttribute("id", "encabezado");

        contenedorLogo.setAttribute("class", "logo");
        contenedorSocialMedia.setAttribute("class", "socialMedia");

        imagenLogo.setAttribute("src", "/assets/img/png/logo.png");
        imagenLogo.setAttribute("alt", "campus_survey_logo");
        imagenLogo.setAttribute("class", "logo__img");
        imagenLogo.setAttribute("title", "logo_campus_survey");

        spanTextLogo.setAttribute("class", "logo__titulo");

        linkInstagram.setAttribute("href", "#");
        linkInstagram.setAttribute("class", "socialMedia__linkIcon");

        imagenInstagram.setAttribute("src", "/assets/img/svg/instagram_lightmode.svg");
        imagenInstagram.setAttribute("alt", "instagram_icon");
        imagenInstagram.setAttribute("class", "socialMedia__igIcon");
        imagenInstagram.setAttribute("title", "instagram");

        linkTwitter.setAttribute("href", "#");
        linkTwitter.setAttribute("class", "socialMedia__linkIcon");

        imagenTwitter.setAttribute("src", "/assets/img/svg/twitter_lightmode.svg");
        imagenTwitter.setAttribute("alt", "Twitter_icon");
        imagenTwitter.setAttribute("class", "socialMedia__ttIcon");
        imagenTwitter.setAttribute("title", "twitter");


        // Creando el DOM para insertarlo al HTML
        cuerpoWebsite.appendChild(encabezado);

        encabezado.appendChild(contenedorLogo);
        encabezado.appendChild(contenedorSocialMedia);

        contenedorLogo.appendChild(imagenLogo);
        contenedorLogo.appendChild(spanTextLogo);
        spanTextLogo.appendChild(textLogoTitulo);

        contenedorSocialMedia.appendChild(linkInstagram);
        contenedorSocialMedia.appendChild(linkTwitter);

        linkInstagram.appendChild(imagenInstagram);
        linkTwitter.appendChild(imagenTwitter);


        // Creando los eventos pertinentes
        document.querySelector(".logo").addEventListener("click", (e) => {
            window.location.href = 'http://127.0.0.1:8080/';

            e.stopImmediatePropagation();
            e.preventDefault();
        });
    }
}

customElements.define("encabezado-component", EncabezadoComponent);