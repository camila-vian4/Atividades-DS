import './style.css'
import logo from '../../assets/Logitech_logo.svg'

// RODAPÉ
export default function Footer() {
    return (
        <footer className='footer'>
            <p>
                <img src={ logo } alt='Logo da empresa'/>
                &copy; {new Date().getFullYear()} - Todos os direitos reservados
                <br />
                SENAI Bahia
            </p>
        </footer>
    )
}