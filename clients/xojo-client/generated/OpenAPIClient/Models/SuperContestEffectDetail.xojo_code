#tag Class
Protected Class SuperContestEffectDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		appeal As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.SuperContestEffectFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		moves() As OpenAPIClient.Models.MoveSummary
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
			Name="appeal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SuperContestEffectFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="moves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


