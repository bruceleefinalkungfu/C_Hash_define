private void closeCursors(PreparedStatement ps, ResultSet resultSet) {
	try {
		if(resultSet != null) {
			resultSet.close();
		}
		if(ps != null) {
			ps.close();
		}
	} catch (SQLException arg3) {
		LOG.error("Unable to close open cursors due to {}", arg3);
	}
}
