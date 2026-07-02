import { Link } from 'react-router-dom'
import './style.css'

export default function Header() {
    return (
        <header>
            <div className='header'>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/cadastro">Cadastro</Link>
                    <Link to="/lista">Lista de Usuários</Link>
                </nav>
            </div>
        </header>
    )
}