import './style.css'
import logo from '../../assets/logo.svg'

export default function Footer() {
  return (
    <footer className="naesquina-footer">
      <div className="footer-container">
        
        {/* Seção 1: Links de Navegação */}
        <div className="footer-links-grid">
          <div className="footer-column">
            <h3>Na Esquina</h3>
            <ul>
              <li><a href="#about">Institucional</a></li>
              <li><a href="#careers">Carreiras</a></li>
              <li><a href="#blog">Nosso Blog</a></li>
            </ul>
          </div>

          <div className="footer-column">
            <h3>Descubra</h3>
            <ul>
              <li><a href="#partners">Seja um Parceiro</a></li>
              <li><a href="#delivery-man">Cadastre seu Mercado</a></li>
              <li><a href="#b2b">Na Esquina Empresas</a></li>
            </ul>
          </div>

          <div className="footer-column">
            <h3>Social</h3>
            <ul>
              <li><a href="#instagram">Instagram</a></li>
              <li><a href="#facebook">Facebook</a></li>
              <li><a href="#linkedin">LinkedIn</a></li>
            </ul>
          </div>

          <div className="footer-column">
            <h3>Baixe o app</h3>
            <div className="app-badges">
              <a href="#appstore" className="app-btn">
                <span className="app-btn-sub">Disponível na</span>
                <span className="app-btn-title">App Store</span>
              </a>
              <a href="#playstore" className="app-btn">
                <span className="app-btn-sub">Disponível no</span>
                <span className="app-btn-title">Google Play</span>
              </a>
            </div>
          </div>
        </div>

        <hr className="footer-divider" />

        {/* Seção 2: Logo, Slogan e Termos Legais */}
        <div className="footer-bottom">
          <div className="footer-brand">
            <img src={logo} alt="Logo Na Esquina" className="footer-logo-img" />
            
            <p className="copyright">
              &copy; {new Date().getFullYear()} - Seu mercadinho na palma da mão:
              <br />Rápido, prático e perto de você! 🧡
              <br /><strong>Na Esquina S.A.</strong> Todos os direitos reservados.
            </p>
          </div>
          
          <div className="footer-legal-links">
            <a href="#terms">Termos de uso</a>
            <a href="#privacy">Privacidade</a>
            <a href="#security">Dicas de segurança</a>
          </div>
        </div>

      </div>
    </footer>
  );
}