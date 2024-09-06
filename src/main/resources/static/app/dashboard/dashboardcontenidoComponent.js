export class DashboardcontenidoComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const cuerpoWebsite = document.getElementById("cuerpoWebDashboard");


        // Creando los elementos HTML necesarios
        let mainPrincipal = document.createElement("main");
        let divContainerContent = document.createElement("div");
        let divContentTabs = document.createElement("div");
        let buttonTabsAll = document.createElement("button");
        let buttonTabsActive = document.createElement("button");
        let buttonTabsInactive = document.createElement("button");
        let divfomulariosContainer = document.createElement("div");  // AQUÍ VAN LOS FORMULARIOS INSERTADOS DINÁMICAMENTE


        // Creando los nodos de texto correspondientes
        let textBtnAll = document.createTextNode("Todos los Forms");
        let textBtnActive = document.createTextNode("Forms Activos");
        let textBtnInactive = document.createTextNode("Forms Inactivos");


        // Agregándole los atributos a cada etiqueta
        mainPrincipal.setAttribute("id", "principal");
        mainPrincipal.setAttribute("class", "principal");

        divContainerContent.setAttribute("class", "container");

        divContentTabs.setAttribute("class", "container__tabs");

        buttonTabsAll.setAttribute("class", "containerTabs__btnTabs containerTabs__btnTabs--active");
        buttonTabsAll.setAttribute("data-tab", "all");

        buttonTabsActive.setAttribute("class", "containerTabs__btnTabs");
        buttonTabsActive.setAttribute("data-tab", "active");

        buttonTabsInactive.setAttribute("class", "containerTabs__btnTabs");
        buttonTabsInactive.setAttribute("data-tab", "inactive");

        divfomulariosContainer.setAttribute("id", "formContainer");
        divfomulariosContainer.setAttribute("class", "tarjetasForms");


        // Agregar los nodos de texto correspondientes
        buttonTabsAll.appendChild(textBtnAll);
        buttonTabsActive.appendChild(textBtnActive);
        buttonTabsInactive.appendChild(textBtnInactive);


        // Creando el DOM para insertarlo al HTML
        cuerpoWebsite.appendChild(mainPrincipal);
        mainPrincipal.appendChild(divContainerContent);
        divContainerContent.appendChild(divContentTabs);
        divContentTabs.appendChild(buttonTabsAll);
        divContentTabs.appendChild(buttonTabsActive);
        divContentTabs.appendChild(buttonTabsInactive);
        divContainerContent.appendChild(divfomulariosContainer);


        // Creando los eventos pertinentes
    }
}

customElements.define("dashboardcontenido-component", DashboardcontenidoComponent);