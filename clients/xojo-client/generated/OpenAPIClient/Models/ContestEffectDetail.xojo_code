#tag Class
Protected Class ContestEffectDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		appeal As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		jam As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_entries() As OpenAPIClient.Models.ContestEffectEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.ContestEffectFlavorText
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
			Name="jam"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ContestEffectEffectText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ContestEffectFlavorText"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


