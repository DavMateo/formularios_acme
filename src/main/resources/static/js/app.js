import '/app/bienvenida/encabezado/encabezadoComponent.js';
import '/app/bienvenida/principal/principalcontentComponent.js';
import '/app/bienvenida/pieDePagina/footerComponent.js';

import '/app/loginUser/login/iniciosesionComponent.js';

import '/app/componentesPrincipales/appHeaderComponent.js';
import '/app/dashboard/dashboardcontenidoComponent.js';
import '/app/dashboard/dashboardbuttonComponent.js';
import '/app/componentesPrincipales/appFooterComponent.js';



const bodyHtml = document.querySelector("body");
let infoDataSet = parseInt(bodyHtml.dataset['idx']);

if(infoDataSet === 3) {
    document.addEventListener('DOMContentLoaded', () => {
        const forms = [
            { id: 1, title: 'Customer Feedback', description: 'Gather feedback from our customers', isActive: true, responses: 24, color: '#3b82f6' },
            { id: 2, title: 'Employee Satisfaction', description: 'Annual employee satisfaction survey', isActive: false, responses: 18, color: '#8b5cf6' },
            { id: 3, title: 'Product Feature Request', description: 'Collect feature requests from users', isActive: true, responses: 56, color: '#10b981' },
            { id: 4, title: 'Event Registration', description: 'Sign-up form for upcoming events', isActive: true, responses: 42, color: '#f59e0b' },
        ];

        const formContainer = document.getElementById('formContainer');
        const tabButtons = document.querySelectorAll('.containerTabs__btnTabs');
        const createFormBtn = document.getElementById('btnCrearForm');

        function renderForms(formsToRender) {
            formContainer.innerHTML = '';
            formsToRender.forEach((form, index) => {
                const formCard = createFormCard(form, index);
                formContainer.appendChild(formCard);
            });
        }

        function createFormCard(form, index) {
            const card = document.createElement('div');
            card.className = 'form-card';
            card.style.animationDelay = `${index * 0.1}s`;

            card.innerHTML = `
                <div class="form-card-color-bar" style="background-color: ${form.color};"></div>
                <div class="form-card-content">
                    <div class="form-card-header">
                        <h2 class="form-card-title">${form.title}</h2>
                        <svg class="form-card-status-icon ${form.isActive ? 'active' : 'inactive'}" viewBox="0 0 20 20" fill="currentColor">
                            ${form.isActive 
                                ? '<path fill-rule="evenodd" d="M10 18a8 8 0 100-16 8 8 0 000 16zm3.707-9.293a1 1 0 00-1.414-1.414L9 10.586 7.707 9.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l4-4z" clip-rule="evenodd" />'
                                : '<path fill-rule="evenodd" d="M10 18a8 8 0 100-16 8 8 0 000 16zM8.707 7.293a1 1 0 00-1.414 1.414L8.586 10l-1.293 1.293a1 1 0 101.414 1.414L10 11.414l1.293 1.293a1 1 0 001.414-1.414L11.414 10l1.293-1.293a1 1 0 00-1.414-1.414L10 8.586 8.707 7.293z" clip-rule="evenodd" />'
                            }
                        </svg>
                    </div>
                    <p class="form-card-description">${form.description}</p>
                    <div class="form-card-footer">
                        <span class="form-card-status ${form.isActive ? 'active' : 'inactive'}">
                            ${form.isActive ? 'Active' : 'Inactive'}
                        </span>
                        <span class="form-card-responses">Responses: ${form.responses}</span>
                    </div>
                </div>
                <div class="form-card-actions">
                    <button class="action-btn edit">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor">
                            <path d="M13.586 3.586a2 2 0 112.828 2.828l-.793.793-2.828-2.828.793-.793zM11.379 5.793L3 14.172V17h2.828l8.38-8.379-2.83-2.828z" />
                        </svg>
                        Edit
                    </button>
                    <button class="action-btn analytics">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor">
                            <path d="M2 11a1 1 0 011-1h2a1 1 0 011 1v5a1 1 0 01-1 1H3a1 1 0 01-1-1v-5zM8 7a1 1 0 011-1h2a1 1 0 011 1v9a1 1 0 01-1 1H9a1 1 0 01-1-1V7zM14 4a1 1 0 011-1h2a1 1 0 011 1v12a1 1 0 01-1 1h-2a1 1 0 01-1-1V4z" />
                        </svg>
                        Analytics
                    </button>
                    <button class="action-btn preview">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor">
                            <path d="M10 12a2 2 0 100-4 2 2 0 000 4z" />
                            <path fill-rule="evenodd" d="M.458 10C1.732 5.943 5.522 3 10 3s8.268 2.943 9.542 7c-1.274 4.057-5.064 7-9.542 7S1.732 14.057.458 10zM14 10a4 4 0 11-8 0 4 4 0 018 0z" clip-rule="evenodd" />
                        </svg>
                        Preview
                    </button>
                    <button class="action-btn delete">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor">
                            <path fill-rule="evenodd" d="M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z" clip-rule="evenodd" />
                        </svg>
                    </button>
                </div>
            `;

            return card;
        }

        function filterForms(tab) {
            switch(tab) {
                case 'active':
                    return forms.filter(form => form.isActive);
                case 'inactive':
                    return forms.filter(form => !form.isActive);
                default:
                    return forms;
            }
        }

        tabButtons.forEach(button => {
            button.addEventListener('click', () => {
                tabButtons.forEach(btn => btn.classList.remove('containerTabs__btnTabs--active'));
                button.classList.add('containerTabs__btnTabs--active');
                const tab = button.getAttribute('data-tab');
                renderForms(filterForms(tab));
                addRippleToButtons();
            });
        });

        function createRipple(event) {
            const button = event.currentTarget;

            const circle = document.createElement("span");
            const diameter = Math.max(button.clientWidth, button.clientHeight);
            const radius = diameter / 2;

            circle.style.width = circle.style.height = `${diameter}px`;
            circle.style.left = `${event.clientX - button.offsetLeft - radius}px`;
            circle.style.top = `${event.clientY - button.offsetTop - radius}px`;
            circle.classList.add("ripple");

            const ripple = button.getElementsByClassName("ripple")[0];

            if (ripple) {
                ripple.remove();
            }

            button.appendChild(circle);
        }

        function addRippleToButtons() {
            const buttons = document.querySelectorAll('.action-btn');
            buttons.forEach(button => {
                button.addEventListener('click', createRipple);
            });
        }

        // Initial render
        renderForms(forms);
        addRippleToButtons();

        // Floating button animation
        createFormBtn.addEventListener('click', () => {
            createFormBtn.classList.add('clicked');
            setTimeout(() => {
                createFormBtn.classList.remove('clicked');
            }, 500);
        });
    });
}