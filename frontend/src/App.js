import React from 'react';
import UserRegistration from './components/UserRegistration';
import UtilityUsageChart from './components/UtilityUsageChart';
import './App.css'; // Import global styles

/**
 * Main application component.
 */
const App = () => {
    return (
        <div className="container">
            <h1>Smart Utility Management System</h1>
            <UserRegistration />
            <UtilityUsageChart />
        </div>
    );
};

export default App;
