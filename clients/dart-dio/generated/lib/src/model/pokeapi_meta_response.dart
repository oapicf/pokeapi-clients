//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeapi_meta_response.g.dart';

/// PokeapiMetaResponse
///
/// Properties:
/// * [deployDate] - The deployment time as a Unix timestamp string.
/// * [hash] - The source commit hash used for this deployment.
/// * [tag] - The deployment tag, or null if the deployment has no tag.
@BuiltValue()
abstract class PokeapiMetaResponse implements Built<PokeapiMetaResponse, PokeapiMetaResponseBuilder> {
  /// The deployment time as a Unix timestamp string.
  @BuiltValueField(wireName: r'deploy_date')
  String? get deployDate;

  /// The source commit hash used for this deployment.
  @BuiltValueField(wireName: r'hash')
  String? get hash;

  /// The deployment tag, or null if the deployment has no tag.
  @BuiltValueField(wireName: r'tag')
  String? get tag;

  PokeapiMetaResponse._();

  factory PokeapiMetaResponse([void updates(PokeapiMetaResponseBuilder b)]) = _$PokeapiMetaResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeapiMetaResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeapiMetaResponse> get serializer => _$PokeapiMetaResponseSerializer();
}

class _$PokeapiMetaResponseSerializer implements PrimitiveSerializer<PokeapiMetaResponse> {
  @override
  final Iterable<Type> types = const [PokeapiMetaResponse, _$PokeapiMetaResponse];

  @override
  final String wireName = r'PokeapiMetaResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeapiMetaResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'deploy_date';
    yield object.deployDate == null ? null : serializers.serialize(
      object.deployDate,
      specifiedType: const FullType.nullable(String),
    );
    yield r'hash';
    yield object.hash == null ? null : serializers.serialize(
      object.hash,
      specifiedType: const FullType.nullable(String),
    );
    yield r'tag';
    yield object.tag == null ? null : serializers.serialize(
      object.tag,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeapiMetaResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeapiMetaResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deploy_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.deployDate = valueDes;
          break;
        case r'hash':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.hash = valueDes;
          break;
        case r'tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.tag = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeapiMetaResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeapiMetaResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


