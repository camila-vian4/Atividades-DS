import { Link, NavLink } from 'react-router-dom'
import './style.css'

// CABEÇALHO
export default function Header() {
    return (
        <header>
            <div>
                <Link to='/' className='header-logo'>
                    <h1>Empresa de contabilidade</h1>
                </Link>
            </div>

            <nav>
                <NavLink>
                    <Link to='/'>Home</Link>
                </NavLink>
                <NavLink>
                    <Link to='/sobre-nos'>Sobre Nós</Link>
                </NavLink>
                <NavLink>
                    <Link to='/produtos'>Produtos</Link>
                </NavLink>
            </nav>
        </header>
    )
}