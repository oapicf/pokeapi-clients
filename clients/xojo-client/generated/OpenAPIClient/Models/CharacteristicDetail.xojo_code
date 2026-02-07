#tag Class
Protected Class CharacteristicDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		gene_modulo As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		possible_values() As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		highest_stat As OpenAPIClient.Models.StatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		descriptions() As OpenAPIClient.Models.CharacteristicDescription
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gene_modulo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="possible_values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="highest_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="descriptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CharacteristicDescription"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


