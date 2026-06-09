import './style.css'

// RODAPÉ
export default function Footer() {
    return (
        <footer>
            <strong>Empresa de contabilidade</strong>
            <p>Copyright &copy; {new Date().getFullYear()} - Todos os direitos reservados.</p>
        </footer>
    )
}