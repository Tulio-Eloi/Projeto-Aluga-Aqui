import './MyButton.css'

const MyButton = ({ label, onClick, type='button' }) =>{
    return(
        <button type={type} onClick={onClick}>{label}</button>
    )
}

export default MyButton