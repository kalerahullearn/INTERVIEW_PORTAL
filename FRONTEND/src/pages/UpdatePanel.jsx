import { useState } from "react";
import { Header } from "../components/Header";
import { Button } from "../components/Button";

export const UpdatePanel = () => {

    const [formData, setFormData] = useState({});

    function handleChange(e){
        setFormData({...formData, [e.tagrte.name]: e.target.value});
    }

    return (
        <>
        <Header />
                    <main>
            <div className="max-w-3xl mx-auto m-6 p-6 bg-white shadow rounded-lg">
            <h2 className="text-xl font-semibold mb-6">Add Panel</h2>
            <form className="space-y-4">
                {/* Name */}
                <div>
                <label className="block mb-1 font-medium">Name</label>
                <input
                    type="text"
                    name="name"
                    value={formData?.name}
                    onChange={handleChange}
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                    required
                />
                </div>

                {/* Email */}
                <div>
                <label className="block mb-1 font-medium">Email</label>
                <input
                    type="email"
                    name="email"
                    value={formData?.email}
                    onChange={handleChange}
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                    required
                />
                </div>

                {/* Level */}
                <div>
                <label className="block mb-1 font-medium">Level</label>
                <select
                    name="level"
                    value={formData?.level}
                    onChange={handleChange}
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                    required
                >
                    <option value="">Select Level</option>
                    <option value="junior">Junior</option>
                    <option value="mid">Mid</option>
                    <option value="senior">Senior</option>
                </select>
                </div>

                {/* Skills */}
                <div>
                <label className="block mb-1 font-medium">Skills</label>
                <input
                    type="text"
                    name="skills"
                    value={formData?.skills}
                    onChange={handleChange}
                    placeholder="Comma separated skills"
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                />
                </div>

                {/* Current Location */}
                <div>
                <label className="block mb-1 font-medium">Current Location</label>
                <input
                    type="text"
                    name="currentLocation"
                    value={formData?.currentLocation}
                    onChange={handleChange}
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                />
                </div>

                {/* Experience */}
                <div>
                <label className="block mb-1 font-medium">Experience (years)</label>
                <input
                    type="number"
                    name="experience"
                    value={formData?.experience}
                    onChange={handleChange}
                    min="0"
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                />
                </div>

                {/* Candidate Experience Upto */}
                <div>
                <label className="block mb-1 font-medium">Candidate Experience Upto (years)</label>
                <input
                    type="number"
                    name="candidateExpUpto"
                    value={formData?.candidateExpUpto}
                    onChange={handleChange}
                    min="0"
                    className="w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"
                />
                </div>

                <div className="flex space-x-2 justify-end">
                    <Button  text="Cancel"/>
                    <Button primary={true} text="Save"/>
                </div>

            </form>
            </div>
            </main>
            </>
    );
}