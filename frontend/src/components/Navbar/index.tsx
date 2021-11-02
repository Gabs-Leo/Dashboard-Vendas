import logo from 'assets/img/Cherry.png'

const Navbar = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-item-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <img src={logo} alt="Gabs" className="logo" />
                </nav>
            </div>
        </div>
    );
}

export default Navbar;