import './style.css'

export default function Footer() {
    return (
        <footer>
            <div className='footer'>
                <p>
                    &copy; {new Date().getFullYear()} - Todos os direitos reservados
                    <br />
                    SENAI Bahia
                </p>
            </div>
        </footer>
    )
}