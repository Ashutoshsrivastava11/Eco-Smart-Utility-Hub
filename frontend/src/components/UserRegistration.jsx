import React, { useState } from 'react';
import './UserRegistration.css'; // Import styles

/**
 * Component for user registration form.
 */
const UserRegistration = () => {
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleRegister = () => {
        // Registration logic using API endpoint
    };

    return (
        <div className="user-registration">
            <h2>User Registration</h2>
            <input type="text" placeholder="Name" value={name} onChange={e => setName(e.target.value)} />
            <input type="email" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)} />
            <input type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)} />
            <button onClick={handleRegister}>Register</button>
        </div>
    );
};

export default UserRegistration;
