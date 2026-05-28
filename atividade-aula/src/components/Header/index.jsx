import './style.css'
import logo from '../../assets/logo.svg'

export default function Header() {
  return (
    <header className="naesquina-header">
      <div className="header-container">
        
        {/* Agrupamento da Esquerda: Logo + Menu */}
        <div className="header-left-side">
          <div className="header-brand">
            <a href="/">
              <img src={logo} alt="Logo Na Esquina" className="header-logo-img" />
            </a>
          </div>

          <nav className="header-nav">
            <ul>
              <li><a href="#home" className="active">Início</a></li>
              <li><a href="#stores">Mercados</a></li>
              <li><a href="#about">Sobre nós</a></li>
              <li><a href="#contact">Contato</a></li>
            </ul>
          </nav>
        </div>

        {/* Lado Direito: Ações / Botões */}
        <div className="header-actions">
          <a href="#login" className="btn-login">Entrar</a>
          <a href="#download" className="btn-download">Baixar App</a>
        </div>

      </div>
    </header>
  );
}