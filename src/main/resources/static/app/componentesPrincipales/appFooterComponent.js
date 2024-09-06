export class AppFooterComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const valuesObj = {
            html: {
                cuerpoWebsite: document.getElementById("cuerpoWebDashboard")
            },
            svg: {
                SVG_XMLNS: "http://www.w3.org/2000/svg",
                SVG_XLINK: "http://www.w3.org/1999/xlink"
            }
        }


        // Creando los elementos HTML necesarios


        // Creando los nodos de texto correspondientes


        // Agregándole los atributos a cada etiqueta


        // Agregar los nodos de texto correspondientes


        // Creando el DOM para insertarlo al HTML


        // Creando los eventos pertinentes
    }
}

customElements.define("appfooter-component", AppFooterComponent);